package com.mycollab.common.dao;

import com.mycollab.common.domain.Client;
import com.mycollab.common.domain.ClientExample;
import com.mycollab.db.persistence.ICrudGenericDAO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface ClientMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_client
     *
     * @mbg.generated Fri Feb 01 07:44:15 CST 2019
     */
    long countByExample(ClientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_client
     *
     * @mbg.generated Fri Feb 01 07:44:15 CST 2019
     */
    int deleteByExample(ClientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_client
     *
     * @mbg.generated Fri Feb 01 07:44:15 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_client
     *
     * @mbg.generated Fri Feb 01 07:44:15 CST 2019
     */
    int insert(Client record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_client
     *
     * @mbg.generated Fri Feb 01 07:44:15 CST 2019
     */
    int insertSelective(Client record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_client
     *
     * @mbg.generated Fri Feb 01 07:44:15 CST 2019
     */
    List<Client> selectByExampleWithBLOBs(ClientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_client
     *
     * @mbg.generated Fri Feb 01 07:44:15 CST 2019
     */
    List<Client> selectByExample(ClientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_client
     *
     * @mbg.generated Fri Feb 01 07:44:15 CST 2019
     */
    Client selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_client
     *
     * @mbg.generated Fri Feb 01 07:44:15 CST 2019
     */
    int updateByExampleSelective(@Param("record") Client record, @Param("example") ClientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_client
     *
     * @mbg.generated Fri Feb 01 07:44:15 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") Client record, @Param("example") ClientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_client
     *
     * @mbg.generated Fri Feb 01 07:44:15 CST 2019
     */
    int updateByExample(@Param("record") Client record, @Param("example") ClientExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_client
     *
     * @mbg.generated Fri Feb 01 07:44:15 CST 2019
     */
    int updateByPrimaryKeySelective(Client record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_client
     *
     * @mbg.generated Fri Feb 01 07:44:15 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(Client record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_client
     *
     * @mbg.generated Fri Feb 01 07:44:15 CST 2019
     */
    int updateByPrimaryKey(Client record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_client
     *
     * @mbg.generated Fri Feb 01 07:44:15 CST 2019
     */
    Integer insertAndReturnKey(Client value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_client
     *
     * @mbg.generated Fri Feb 01 07:44:15 CST 2019
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_client
     *
     * @mbg.generated Fri Feb 01 07:44:15 CST 2019
     */
    void massUpdateWithSession(@Param("record") Client record, @Param("primaryKeys") List primaryKeys);
}