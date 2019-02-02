package com.mycollab.module.project.dao;

import com.mycollab.db.persistence.ICrudGenericDAO;
import com.mycollab.module.project.domain.Task;
import com.mycollab.module.project.domain.TaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
@Mapper
public interface TaskMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_task
     *
     * @mbg.generated Fri Feb 01 07:44:13 CST 2019
     */
    long countByExample(TaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_task
     *
     * @mbg.generated Fri Feb 01 07:44:13 CST 2019
     */
    int deleteByExample(TaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_task
     *
     * @mbg.generated Fri Feb 01 07:44:13 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_task
     *
     * @mbg.generated Fri Feb 01 07:44:13 CST 2019
     */
    int insert(Task record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_task
     *
     * @mbg.generated Fri Feb 01 07:44:13 CST 2019
     */
    int insertSelective(Task record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_task
     *
     * @mbg.generated Fri Feb 01 07:44:13 CST 2019
     */
    List<Task> selectByExampleWithBLOBs(TaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_task
     *
     * @mbg.generated Fri Feb 01 07:44:13 CST 2019
     */
    List<Task> selectByExample(TaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_task
     *
     * @mbg.generated Fri Feb 01 07:44:13 CST 2019
     */
    Task selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_task
     *
     * @mbg.generated Fri Feb 01 07:44:13 CST 2019
     */
    int updateByExampleSelective(@Param("record") Task record, @Param("example") TaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_task
     *
     * @mbg.generated Fri Feb 01 07:44:13 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") Task record, @Param("example") TaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_task
     *
     * @mbg.generated Fri Feb 01 07:44:13 CST 2019
     */
    int updateByExample(@Param("record") Task record, @Param("example") TaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_task
     *
     * @mbg.generated Fri Feb 01 07:44:13 CST 2019
     */
    int updateByPrimaryKeySelective(Task record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_task
     *
     * @mbg.generated Fri Feb 01 07:44:13 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(Task record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_task
     *
     * @mbg.generated Fri Feb 01 07:44:13 CST 2019
     */
    int updateByPrimaryKey(Task record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_task
     *
     * @mbg.generated Fri Feb 01 07:44:13 CST 2019
     */
    Integer insertAndReturnKey(Task value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_task
     *
     * @mbg.generated Fri Feb 01 07:44:13 CST 2019
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_task
     *
     * @mbg.generated Fri Feb 01 07:44:13 CST 2019
     */
    void massUpdateWithSession(@Param("record") Task record, @Param("primaryKeys") List primaryKeys);
}