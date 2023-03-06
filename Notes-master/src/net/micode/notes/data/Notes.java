//read by 曾梦媛

package net.micode.notes.data;

import android.net.Uri;
public class Notes {
    //以下是Notes类中定义的常量
    public static final String AUTHORITY = "micode_notes";
    public static final String TAG = "Notes";
    
    //以下三个TYPE常量用于设置NoteColumns.TYPE的值
    public static final int TYPE_NOTE     = 0;
    public static final int TYPE_FOLDER   = 1;
    public static final int TYPE_SYSTEM   = 2;

    /**
     * Following IDs are system folders' identifiers
     * {@link Notes#ID_ROOT_FOLDER } is default folder
     * {@link Notes#ID_TEMPARAY_FOLDER } is for notes belonging no folder
     * {@link Notes#ID_CALL_RECORD_FOLDER} is to store call records
     */
    public static final int ID_ROOT_FOLDER = 0;//系统文件夹标识符
    public static final int ID_TEMPARAY_FOLDER = -1;//默认文件夹标识符
    public static final int ID_CALL_RECORD_FOLDER = -2;//用于保存通话记录的文件夹标识符
    public static final int ID_TRASH_FOLER = -3;//垃圾文件夹标识符

    public static final String INTENT_EXTRA_ALERT_DATE = "net.micode.notes.alert_date";
    public static final String INTENT_EXTRA_BACKGROUND_ID = "net.micode.notes.background_color_id";
    public static final String INTENT_EXTRA_WIDGET_ID = "net.micode.notes.widget_id";
    public static final String INTENT_EXTRA_WIDGET_TYPE = "net.micode.notes.widget_type";
    public static final String INTENT_EXTRA_FOLDER_ID = "net.micode.notes.folder_id";
    public static final String INTENT_EXTRA_CALL_DATE = "net.micode.notes.call_date";

    public static final int TYPE_WIDGET_INVALIDE      = -1;
    public static final int TYPE_WIDGET_2X            = 0;
    public static final int TYPE_WIDGET_4X            = 1;

    public static class DataConstants {
        //数据常量
        public static final String NOTE = TextNote.CONTENT_ITEM_TYPE;
        public static final String CALL_NOTE = CallNote.CONTENT_ITEM_TYPE;
    }

    /**
     * Uri to query all notes and folders
     */
    //查询便签和文件夹的指针
    public static final Uri CONTENT_NOTE_URI = Uri.parse("content://" + AUTHORITY + "/note");

    /**
     * Uri to query data
     */
    //查找数据的指针
    public static final Uri CONTENT_DATA_URI = Uri.parse("content://" + AUTHORITY + "/data");

    //定义NoteColumns类中的常量,这些常量主要定义的是便签的属性，用于后面创建数据库的表头
    public interface NoteColumns {
        /**
         * The unique ID for a row
         * <P> Type: INTEGER (long) </P>
         */
        public static final String ID = "_id";

        /**
         * The parent's id for note or folder
         * <P> Type: INTEGER (long) </P>
         */
        public static final String PARENT_ID = "parent_id";

        /**
         * Created data for note or folder
         * <P> Type: INTEGER (long) </P>
         */
        public static final String CREATED_DATE = "created_date";

        /**
         * Latest modified date
         * <P> Type: INTEGER (long) </P>
         */
        public static final String MODIFIED_DATE = "modified_date";


        /**
         * Alert date
         * <P> Type: INTEGER (long) </P>
         */
        public static final String ALERTED_DATE = "alert_date";

        /**
         * Folder's name or text content of note
         * <P> Type: TEXT </P>
         */
        public static final String SNIPPET = "snippet";

        /**
         * Note's widget id
         * <P> Type: INTEGER (long) </P>
         */
        public static final String WIDGET_ID = "widget_id";

        /**
         * Note's widget type
         * <P> Type: INTEGER (long) </P>
         */
        public static final String WIDGET_TYPE = "widget_type";

        /**
         * Note's background color's id
         * <P> Type: INTEGER (long) </P>
         */
        public static final String BG_COLOR_ID = "bg_color_id";

        /**
         * For text note, it doesn't has attachment, for multi-media
         * note, it has at least one attachment
         * <P> Type: INTEGER </P>
         */
        public static final String HAS_ATTACHMENT = "has_attachment";

        /**
         * Folder's count of notes
         * <P> Type: INTEGER (long) </P>
         */
        public static final String NOTES_COUNT = "notes_count";

        /**
         * The file type: folder or note
         * <P> Type: INTEGER </P>
         */
        public static final String TYPE = "type";

        /**
         * The last sync id
         * <P> Type: INTEGER (long) </P>
         */
        public static final String SYNC_ID = "sync_id";

        /**
         * Sign to indicate local modified or not
         * <P> Type: INTEGER </P>
         */
        public static final String LOCAL_MODIFIED = "local_modified";

        /**
         * Original parent id before moving into temporary folder
         * <P> Type : INTEGER </P>
         */
        public static final String ORIGIN_PARENT_ID = "origin_parent_id";

        /**
         * The gtask id
         * <P> Type : TEXT </P>
         */
        public static final String GTASK_ID = "gtask_id";

        /**
         * The version code
         * <P> Type : INTEGER (long) </P>
         */
        public static final String VERSION = "version";
    }

    // 定义DataColumns类中的常量,这些常量主要定义的是存储便签内容数据，用于后面创建数据库的表头
    public interface DataColumns {
        /**
         * The unique ID for a row
         * <P> Type: INTEGER (long) </P>
         */
        public static final String ID = "_id";

        /**
         * The MIME type of the item represented by this row.
         * <P> Type: Text </P>
         */
        public static final String MIME_TYPE = "mime_type";

        /**
         * The reference id to note that this data belongs to
         * <P> Type: INTEGER (long) </P>
         */
        public static final String NOTE_ID = "note_id";

        /**
         * Created data for note or folder
         * <P> Type: INTEGER (long) </P>
         */
        public static final String CREATED_DATE = "created_date";

        /**
         * Latest modified date
         * <P> Type: INTEGER (long) </P>
         */
        public static final String MODIFIED_DATE = "modified_date";

        /**
         * Data's content
         * <P> Type: TEXT </P>
         */
        public static final String CONTENT = "content";


        /**
         * Generic data column, the meaning is {@link #MIMETYPE} specific, used for
         * integer data type
         * <P> Type: INTEGER </P>
         */
        public static final String DATA1 = "data1";

        /**
         * Generic data column, the meaning is {@link #MIMETYPE} specific, used for
         * integer data type
         * <P> Type: INTEGER </P>
         */
        public static final String DATA2 = "data2";

        /**
         * Generic data column, the meaning is {@link #MIMETYPE} specific, used for
         * TEXT data type
         * <P> Type: TEXT </P>
         */
        public static final String DATA3 = "data3";

        /**
         * Generic data column, the meaning is {@link #MIMETYPE} specific, used for
         * TEXT data type
         * <P> Type: TEXT </P>
         */
        public static final String DATA4 = "data4";

        /**
         * Generic data column, the meaning is {@link #MIMETYPE} specific, used for
         * TEXT data type
         * <P> Type: TEXT </P>
         */
        public static final String DATA5 = "data5";
    }
    
    //文本内容的数据结构
    public static final class TextNote implements DataColumns {
        /**
         * Mode to indicate the text in check list mode or not
         * <P> Type: Integer 1:check list mode 0: normal mode </P>
         */
        public static final String MODE = DATA1;

        public static final int MODE_CHECK_LIST = 1;

        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/text_note";

        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/text_note";

        public static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY + "/text_note");
    }
    
    //电话记录的数据结构
    public static final class CallNote implements DataColumns {
        /**
         * Call date for this record
         * <P> Type: INTEGER (long) </P>
         */
        public static final String CALL_DATE = DATA1;

        /**
         * Phone number for this record
         * <P> Type: TEXT </P>
         */
        public static final String PHONE_NUMBER = DATA3;

        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/call_note";

        public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/call_note";

        public static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY + "/call_note");
    }
}
