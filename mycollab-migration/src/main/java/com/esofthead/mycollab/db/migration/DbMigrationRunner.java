/**
 * This file is part of mycollab-migration.
 *
 * mycollab-migration is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-migration is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-migration.  If not, see <http://www.gnu.org/licenses/>.
 */
/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.esofthead.mycollab.db.migration;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import com.esofthead.mycollab.configuration.SiteConfiguration;
import com.esofthead.mycollab.core.DeploymentMode;
import org.flywaydb.core.Flyway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/**
 * 
 * @author MyCollab Ltd.
 * @since 1.0
 * 
 */
@Component("dbMigration")
@DependsOn("appContextUtil")
public class DbMigrationRunner {
	private static final Logger LOG = LoggerFactory.getLogger(DbMigrationRunner.class);

	@Autowired
	private DataSource dataSource;

	@PostConstruct
	public void migrate() {
		try {
			Flyway flyway = new Flyway();
			flyway.setBaselineOnMigrate(true);
			flyway.setDataSource(dataSource);
			flyway.setValidateOnMigrate(false);
            if (SiteConfiguration.getDeploymentMode() == DeploymentMode.site) {
                flyway.setLocations("db/migration", "db/migration2");
            } else {
                flyway.setLocations("db/migration");
            }

			flyway.migrate();
		} catch (Exception e) {
			LOG.error("Error while migrate database", e);
			System.exit(-1);
		}
	}
}