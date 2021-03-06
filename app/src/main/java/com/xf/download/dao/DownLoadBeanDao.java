package com.xf.download.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.xf.download.lib.DownLoadBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "DOWN_LOAD_BEAN".
*/
public class DownLoadBeanDao extends AbstractDao<DownLoadBean, Long> {

    public static final String TABLENAME = "DOWN_LOAD_BEAN";

    /**
     * Properties of entity DownLoadBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Url = new Property(0, String.class, "url", false, "URL");
        public final static Property Start = new Property(1, long.class, "start", false, "START");
        public final static Property End = new Property(2, long.class, "end", false, "END");
        public final static Property Total = new Property(3, long.class, "total", false, "TOTAL");
        public final static Property TaskId = new Property(4, long.class, "taskId", true, "_id");
        public final static Property FileName = new Property(5, String.class, "fileName", false, "FILE_NAME");
        public final static Property Path = new Property(6, String.class, "path", false, "PATH");
        public final static Property CurrentProgress = new Property(7, long.class, "currentProgress", false, "CURRENT_PROGRESS");
        public final static Property Status = new Property(8, int.class, "status", false, "STATUS");
    }


    public DownLoadBeanDao(DaoConfig config) {
        super(config);
    }
    
    public DownLoadBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"DOWN_LOAD_BEAN\" (" + //
                "\"URL\" TEXT," + // 0: url
                "\"START\" INTEGER NOT NULL ," + // 1: start
                "\"END\" INTEGER NOT NULL ," + // 2: end
                "\"TOTAL\" INTEGER NOT NULL ," + // 3: total
                "\"_id\" INTEGER PRIMARY KEY NOT NULL ," + // 4: taskId
                "\"FILE_NAME\" TEXT," + // 5: fileName
                "\"PATH\" TEXT," + // 6: path
                "\"CURRENT_PROGRESS\" INTEGER NOT NULL ," + // 7: currentProgress
                "\"STATUS\" INTEGER NOT NULL );"); // 8: status
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"DOWN_LOAD_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, DownLoadBean entity) {
        stmt.clearBindings();
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(1, url);
        }
        stmt.bindLong(2, entity.getStart());
        stmt.bindLong(3, entity.getEnd());
        stmt.bindLong(4, entity.getTotal());
        stmt.bindLong(5, entity.getTaskId());
 
        String fileName = entity.getFileName();
        if (fileName != null) {
            stmt.bindString(6, fileName);
        }
 
        String path = entity.getPath();
        if (path != null) {
            stmt.bindString(7, path);
        }
        stmt.bindLong(8, entity.getCurrentProgress());
        stmt.bindLong(9, entity.getStatus());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, DownLoadBean entity) {
        stmt.clearBindings();
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(1, url);
        }
        stmt.bindLong(2, entity.getStart());
        stmt.bindLong(3, entity.getEnd());
        stmt.bindLong(4, entity.getTotal());
        stmt.bindLong(5, entity.getTaskId());
 
        String fileName = entity.getFileName();
        if (fileName != null) {
            stmt.bindString(6, fileName);
        }
 
        String path = entity.getPath();
        if (path != null) {
            stmt.bindString(7, path);
        }
        stmt.bindLong(8, entity.getCurrentProgress());
        stmt.bindLong(9, entity.getStatus());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 4);
    }    

    @Override
    public DownLoadBean readEntity(Cursor cursor, int offset) {
        DownLoadBean entity = new DownLoadBean( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // url
            cursor.getLong(offset + 1), // start
            cursor.getLong(offset + 2), // end
            cursor.getLong(offset + 3), // total
            cursor.getLong(offset + 4), // taskId
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // fileName
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // path
            cursor.getLong(offset + 7), // currentProgress
            cursor.getInt(offset + 8) // status
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, DownLoadBean entity, int offset) {
        entity.setUrl(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setStart(cursor.getLong(offset + 1));
        entity.setEnd(cursor.getLong(offset + 2));
        entity.setTotal(cursor.getLong(offset + 3));
        entity.setTaskId(cursor.getLong(offset + 4));
        entity.setFileName(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setPath(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setCurrentProgress(cursor.getLong(offset + 7));
        entity.setStatus(cursor.getInt(offset + 8));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(DownLoadBean entity, long rowId) {
        entity.setTaskId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(DownLoadBean entity) {
        if(entity != null) {
            return entity.getTaskId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(DownLoadBean entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
