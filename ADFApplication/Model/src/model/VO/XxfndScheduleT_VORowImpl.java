package model.VO;

import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Number;
import oracle.jbo.domain.RowID;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Jul 25 12:22:48 IST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxfndScheduleT_VORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        ScheduleId {
            public Object get(XxfndScheduleT_VORowImpl obj) {
                return obj.getScheduleId();
            }

            public void put(XxfndScheduleT_VORowImpl obj, Object value) {
                obj.setScheduleId((Number)value);
            }
        }
        ,
        ScheduleName {
            public Object get(XxfndScheduleT_VORowImpl obj) {
                return obj.getScheduleName();
            }

            public void put(XxfndScheduleT_VORowImpl obj, Object value) {
                obj.setScheduleName((String)value);
            }
        }
        ,
        FrequencyMin {
            public Object get(XxfndScheduleT_VORowImpl obj) {
                return obj.getFrequencyMin();
            }

            public void put(XxfndScheduleT_VORowImpl obj, Object value) {
                obj.setFrequencyMin((Number)value);
            }
        }
        ,
        ProgramName {
            public Object get(XxfndScheduleT_VORowImpl obj) {
                return obj.getProgramName();
            }

            public void put(XxfndScheduleT_VORowImpl obj, Object value) {
                obj.setProgramName((String)value);
            }
        }
        ,
        BiReportPath {
            public Object get(XxfndScheduleT_VORowImpl obj) {
                return obj.getBiReportPath();
            }

            public void put(XxfndScheduleT_VORowImpl obj, Object value) {
                obj.setBiReportPath((String)value);
            }
        }
        ,
        BiReportName {
            public Object get(XxfndScheduleT_VORowImpl obj) {
                return obj.getBiReportName();
            }

            public void put(XxfndScheduleT_VORowImpl obj, Object value) {
                obj.setBiReportName((String)value);
            }
        }
        ,
        DbRefreshPkg {
            public Object get(XxfndScheduleT_VORowImpl obj) {
                return obj.getDbRefreshPkg();
            }

            public void put(XxfndScheduleT_VORowImpl obj, Object value) {
                obj.setDbRefreshPkg((String)value);
            }
        }
        ,
        NextScheduleTime {
            public Object get(XxfndScheduleT_VORowImpl obj) {
                return obj.getNextScheduleTime();
            }

            public void put(XxfndScheduleT_VORowImpl obj, Object value) {
                obj.setNextScheduleTime((Timestamp)value);
            }
        }
        ,
        CreatedBy {
            public Object get(XxfndScheduleT_VORowImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(XxfndScheduleT_VORowImpl obj, Object value) {
                obj.setCreatedBy((String)value);
            }
        }
        ,
        CreationDate {
            public Object get(XxfndScheduleT_VORowImpl obj) {
                return obj.getCreationDate();
            }

            public void put(XxfndScheduleT_VORowImpl obj, Object value) {
                obj.setCreationDate((Timestamp)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(XxfndScheduleT_VORowImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(XxfndScheduleT_VORowImpl obj, Object value) {
                obj.setLastUpdatedBy((String)value);
            }
        }
        ,
        LastUpdateDate {
            public Object get(XxfndScheduleT_VORowImpl obj) {
                return obj.getLastUpdateDate();
            }

            public void put(XxfndScheduleT_VORowImpl obj, Object value) {
                obj.setLastUpdateDate((Timestamp)value);
            }
        }
        ,
        LastUpdateLogin {
            public Object get(XxfndScheduleT_VORowImpl obj) {
                return obj.getLastUpdateLogin();
            }

            public void put(XxfndScheduleT_VORowImpl obj, Object value) {
                obj.setLastUpdateLogin((String)value);
            }
        }
        ,
        RunStatus {
            public Object get(XxfndScheduleT_VORowImpl obj) {
                return obj.getRunStatus();
            }

            public void put(XxfndScheduleT_VORowImpl obj, Object value) {
                obj.setRunStatus((String)value);
            }
        }
        ,
        Status {
            public Object get(XxfndScheduleT_VORowImpl obj) {
                return obj.getStatus();
            }

            public void put(XxfndScheduleT_VORowImpl obj, Object value) {
                obj.setStatus((String)value);
            }
        }
        ,
        RowID {
            public Object get(XxfndScheduleT_VORowImpl obj) {
                return obj.getRowID();
            }

            public void put(XxfndScheduleT_VORowImpl obj, Object value) {
                obj.setRowID((oracle.jbo.domain.RowID)value);
            }
        }
        ,
        ApplicationName {
            public Object get(XxfndScheduleT_VORowImpl obj) {
                return obj.getApplicationName();
            }

            public void put(XxfndScheduleT_VORowImpl obj, Object value) {
                obj.setApplicationName((String)value);
            }
        }
        ,
        DbTableName {
            public Object get(XxfndScheduleT_VORowImpl obj) {
                return obj.getDbTableName();
            }

            public void put(XxfndScheduleT_VORowImpl obj, Object value) {
                obj.setDbTableName((String)value);
            }
        }
        ,
        DbColumnNames {
            public Object get(XxfndScheduleT_VORowImpl obj) {
                return obj.getDbColumnNames();
            }

            public void put(XxfndScheduleT_VORowImpl obj, Object value) {
                obj.setDbColumnNames((String)value);
            }
        }
        ,
        XxfndScheduleListT_VO {
            public Object get(XxfndScheduleT_VORowImpl obj) {
                return obj.getXxfndScheduleListT_VO();
            }

            public void put(XxfndScheduleT_VORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        Schedule_STVO1 {
            public Object get(XxfndScheduleT_VORowImpl obj) {
                return obj.getSchedule_STVO1();
            }

            public void put(XxfndScheduleT_VORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        LookupROVO1 {
            public Object get(XxfndScheduleT_VORowImpl obj) {
                return obj.getLookupROVO1();
            }

            public void put(XxfndScheduleT_VORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(XxfndScheduleT_VORowImpl object);

        public abstract void put(XxfndScheduleT_VORowImpl object,
                                 Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() +
                AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int SCHEDULEID = AttributesEnum.ScheduleId.index();
    public static final int SCHEDULENAME = AttributesEnum.ScheduleName.index();
    public static final int FREQUENCYMIN = AttributesEnum.FrequencyMin.index();
    public static final int PROGRAMNAME = AttributesEnum.ProgramName.index();
    public static final int BIREPORTPATH = AttributesEnum.BiReportPath.index();
    public static final int BIREPORTNAME = AttributesEnum.BiReportName.index();
    public static final int DBREFRESHPKG = AttributesEnum.DbRefreshPkg.index();
    public static final int NEXTSCHEDULETIME = AttributesEnum.NextScheduleTime.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATELOGIN = AttributesEnum.LastUpdateLogin.index();
    public static final int RUNSTATUS = AttributesEnum.RunStatus.index();
    public static final int STATUS = AttributesEnum.Status.index();
    public static final int ROWID = AttributesEnum.RowID.index();
    public static final int APPLICATIONNAME = AttributesEnum.ApplicationName.index();
    public static final int DBTABLENAME = AttributesEnum.DbTableName.index();
    public static final int DBCOLUMNNAMES = AttributesEnum.DbColumnNames.index();
    public static final int XXFNDSCHEDULELISTT_VO = AttributesEnum.XxfndScheduleListT_VO.index();
    public static final int SCHEDULE_STVO1 = AttributesEnum.Schedule_STVO1.index();
    public static final int LOOKUPROVO1 = AttributesEnum.LookupROVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public XxfndScheduleT_VORowImpl() {
    }

    /**
     * Gets XxfndScheduleT_EO entity object.
     * @return the XxfndScheduleT_EO
     */
    public EntityImpl getXxfndScheduleT_EO() {
        return (EntityImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for SCHEDULE_ID using the alias name ScheduleId.
     * @return the SCHEDULE_ID
     */
    public Number getScheduleId() {
        return (Number)getAttributeInternal(SCHEDULEID);
    }

    /**
     * Sets <code>value</code> as attribute value for SCHEDULE_ID using the alias name ScheduleId.
     * @param value value to set the SCHEDULE_ID
     */
    public void setScheduleId(Number value) {
        setAttributeInternal(SCHEDULEID, value);
    }

    /**
     * Gets the attribute value for SCHEDULE_NAME using the alias name ScheduleName.
     * @return the SCHEDULE_NAME
     */
    public String getScheduleName() {
        return (String)getAttributeInternal(SCHEDULENAME);
    }

    /**
     * Sets <code>value</code> as attribute value for SCHEDULE_NAME using the alias name ScheduleName.
     * @param value value to set the SCHEDULE_NAME
     */
    public void setScheduleName(String value) {
        setAttributeInternal(SCHEDULENAME, value);
    }

    /**
     * Gets the attribute value for FREQUENCY_MIN using the alias name FrequencyMin.
     * @return the FREQUENCY_MIN
     */
    public Number getFrequencyMin() {
        return (Number)getAttributeInternal(FREQUENCYMIN);
    }

    /**
     * Sets <code>value</code> as attribute value for FREQUENCY_MIN using the alias name FrequencyMin.
     * @param value value to set the FREQUENCY_MIN
     */
    public void setFrequencyMin(Number value) {
        setAttributeInternal(FREQUENCYMIN, value);
    }

    /**
     * Gets the attribute value for PROGRAM_NAME using the alias name ProgramName.
     * @return the PROGRAM_NAME
     */
    public String getProgramName() {
        return (String)getAttributeInternal(PROGRAMNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for PROGRAM_NAME using the alias name ProgramName.
     * @param value value to set the PROGRAM_NAME
     */
    public void setProgramName(String value) {
        setAttributeInternal(PROGRAMNAME, value);
    }

    /**
     * Gets the attribute value for BI_REPORT_PATH using the alias name BiReportPath.
     * @return the BI_REPORT_PATH
     */
    public String getBiReportPath() {
        return (String)getAttributeInternal(BIREPORTPATH);
    }

    /**
     * Sets <code>value</code> as attribute value for BI_REPORT_PATH using the alias name BiReportPath.
     * @param value value to set the BI_REPORT_PATH
     */
    public void setBiReportPath(String value) {
        setAttributeInternal(BIREPORTPATH, value);
    }

    /**
     * Gets the attribute value for BI_REPORT_NAME using the alias name BiReportName.
     * @return the BI_REPORT_NAME
     */
    public String getBiReportName() {
        return (String)getAttributeInternal(BIREPORTNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for BI_REPORT_NAME using the alias name BiReportName.
     * @param value value to set the BI_REPORT_NAME
     */
    public void setBiReportName(String value) {
        setAttributeInternal(BIREPORTNAME, value);
    }

    /**
     * Gets the attribute value for DB_REFRESH_PKG using the alias name DbRefreshPkg.
     * @return the DB_REFRESH_PKG
     */
    public String getDbRefreshPkg() {
        return (String)getAttributeInternal(DBREFRESHPKG);
    }

    /**
     * Sets <code>value</code> as attribute value for DB_REFRESH_PKG using the alias name DbRefreshPkg.
     * @param value value to set the DB_REFRESH_PKG
     */
    public void setDbRefreshPkg(String value) {
        setAttributeInternal(DBREFRESHPKG, value);
    }

    /**
     * Gets the attribute value for NEXT_SCHEDULE_TIME using the alias name NextScheduleTime.
     * @return the NEXT_SCHEDULE_TIME
     */
    public Timestamp getNextScheduleTime() {
        return (Timestamp)getAttributeInternal(NEXTSCHEDULETIME);
    }

    /**
     * Sets <code>value</code> as attribute value for NEXT_SCHEDULE_TIME using the alias name NextScheduleTime.
     * @param value value to set the NEXT_SCHEDULE_TIME
     */
    public void setNextScheduleTime(Timestamp value) {
        setAttributeInternal(NEXTSCHEDULETIME, value);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
     */
    public String getCreatedBy() {
        return (String)getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy.
     * @param value value to set the CREATED_BY
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CREATION_DATE using the alias name CreationDate.
     * @return the CREATION_DATE
     */
    public Timestamp getCreationDate() {
        return (Timestamp)getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATION_DATE using the alias name CreationDate.
     * @param value value to set the CREATION_DATE
     */
    public void setCreationDate(Timestamp value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @return the LAST_UPDATED_BY
     */
    public String getLastUpdatedBy() {
        return (String)getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @param value value to set the LAST_UPDATED_BY
     */
    public void setLastUpdatedBy(String value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate.
     * @return the LAST_UPDATE_DATE
     */
    public Timestamp getLastUpdateDate() {
        return (Timestamp)getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate.
     * @param value value to set the LAST_UPDATE_DATE
     */
    public void setLastUpdateDate(Timestamp value) {
        setAttributeInternal(LASTUPDATEDATE, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATE_LOGIN using the alias name LastUpdateLogin.
     * @return the LAST_UPDATE_LOGIN
     */
    public String getLastUpdateLogin() {
        return (String)getAttributeInternal(LASTUPDATELOGIN);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATE_LOGIN using the alias name LastUpdateLogin.
     * @param value value to set the LAST_UPDATE_LOGIN
     */
    public void setLastUpdateLogin(String value) {
        setAttributeInternal(LASTUPDATELOGIN, value);
    }

    /**
     * Gets the attribute value for RUN_STATUS using the alias name RunStatus.
     * @return the RUN_STATUS
     */
    public String getRunStatus() {
        return (String)getAttributeInternal(RUNSTATUS);
    }

    /**
     * Sets <code>value</code> as attribute value for RUN_STATUS using the alias name RunStatus.
     * @param value value to set the RUN_STATUS
     */
    public void setRunStatus(String value) {
        setAttributeInternal(RUNSTATUS, value);
    }

    /**
     * Gets the attribute value for STATUS using the alias name Status.
     * @return the STATUS
     */
    public String getStatus() {
        return (String)getAttributeInternal(STATUS);
    }

    /**
     * Sets <code>value</code> as attribute value for STATUS using the alias name Status.
     * @param value value to set the STATUS
     */
    public void setStatus(String value) {
        setAttributeInternal(STATUS, value);
    }

    /**
     * Gets the attribute value for ROWID using the alias name RowID.
     * @return the ROWID
     */
    public RowID getRowID() {
        return (RowID)getAttributeInternal(ROWID);
    }

    /**
     * Sets <code>value</code> as attribute value for ROWID using the alias name RowID.
     * @param value value to set the ROWID
     */
    public void setRowID(RowID value) {
        setAttributeInternal(ROWID, value);
    }


    /**
     * Gets the attribute value for APPLICATION_NAME using the alias name ApplicationName.
     * @return the APPLICATION_NAME
     */
    public String getApplicationName() {
        return (String) getAttributeInternal(APPLICATIONNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for APPLICATION_NAME using the alias name ApplicationName.
     * @param value value to set the APPLICATION_NAME
     */
    public void setApplicationName(String value) {
        setAttributeInternal(APPLICATIONNAME, value);
    }

    /**
     * Gets the attribute value for DB_TABLE_NAME using the alias name DbTableName.
     * @return the DB_TABLE_NAME
     */
    public String getDbTableName() {
        return (String) getAttributeInternal(DBTABLENAME);
    }

    /**
     * Sets <code>value</code> as attribute value for DB_TABLE_NAME using the alias name DbTableName.
     * @param value value to set the DB_TABLE_NAME
     */
    public void setDbTableName(String value) {
        setAttributeInternal(DBTABLENAME, value);
    }

    /**
     * Gets the attribute value for DB_COLUMN_NAMES using the alias name DbColumnNames.
     * @return the DB_COLUMN_NAMES
     */
    public String getDbColumnNames() {
        return (String) getAttributeInternal(DBCOLUMNNAMES);
    }

    /**
     * Sets <code>value</code> as attribute value for DB_COLUMN_NAMES using the alias name DbColumnNames.
     * @param value value to set the DB_COLUMN_NAMES
     */
    public void setDbColumnNames(String value) {
        setAttributeInternal(DBCOLUMNNAMES, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link XxfndScheduleListT_VO.
     */
    public RowIterator getXxfndScheduleListT_VO() {
        return (RowIterator)getAttributeInternal(XXFNDSCHEDULELISTT_VO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> Schedule_STVO1.
     */
    public RowSet getSchedule_STVO1() {
        return (RowSet)getAttributeInternal(SCHEDULE_STVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> LookupROVO1.
     */
    public RowSet getLookupROVO1() {
        return (RowSet)getAttributeInternal(LOOKUPROVO1);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}
