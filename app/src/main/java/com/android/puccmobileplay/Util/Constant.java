package com.android.puccmobileplay.Util;

/**
 * Created by 99653 on 2017/10/17.
 * 常量类
 */

public class Constant {
    /**
     * 网络视频API
     */
    public static final String NET_VIDEO_JSON_URI = "http://api.m.mtime.cn/PageSubArea/TrailerList.api";

    public static final String CONTACT_CHANGED = "contact_changed";// 发送联系人变化的广播
    public static final String CONTACT_INVITE_CHANGED = "contact_invite_changed";// 联系人邀请信息变化的广播
    public static final String GROUP_INVITE_CHANGED = "group_invite_changed";// 群邀请信息变化的广播
    public static final String GROUP_ID = "group_id";// 群id
    public static final String EXIT_GROUP = "exit_group";// 退群广播

    public static final String NEW_FRIENDS_USERNAME = "item_new_friends";
    public static final String GROUP_USERNAME = "item_groups";
    public static final String CHAT_ROOM = "item_chatroom";
    public static final String ACCOUNT_REMOVED = "account_removed";
    public static final String ACCOUNT_CONFLICT = "conflict";
    public static final String ACCOUNT_FORBIDDEN = "user_forbidden";
    public static final String ACCOUNT_KICKED_BY_CHANGE_PASSWORD = "kicked_by_change_password";
    public static final String ACCOUNT_KICKED_BY_OTHER_DEVICE = "kicked_by_another_device";
    public static final String CHAT_ROBOT = "item_robots";
    public static final String MESSAGE_ATTR_ROBOT_MSGTYPE = "msgtype";
    public static final String ACTION_GROUP_CHANAGED = "action_group_changed";
    public static final String ACTION_CONTACT_CHANAGED = "action_contact_changed";

    public static final String EXTRA_CONFERENCE_ID = "confId";
    public static final String EXTRA_CONFERENCE_PASS = "password";
    public static final String EXTRA_CONFERENCE_INVITER = "inviter";
    public static final String EXTRA_CONFERENCE_IS_CREATOR = "is_creator";
    public static final String EXTRA_CONFERENCE_GROUP_ID = "group_id";

    public static final String MSG_ATTR_CONF_ID = "conferenceId";
    public static final String MSG_ATTR_CONF_PASS = EXTRA_CONFERENCE_PASS;
    public static final String MSG_ATTR_EXTENSION = "msg_extension";

    public static final String EM_CONFERENCE_OP = "em_conference_op";
    public static final String EM_CONFERENCE_ID = "em_conference_id";
    public static final String EM_CONFERENCE_PASSWORD = "em_conference_password";
    public static final String EM_CONFERENCE_TYPE = "em_conference_type";
    public static final String EM_MEMBER_NAME = "em_member_name";

    public static final String OP_INVITE = "invite";
    public static final String OP_REQUEST_TOBE_SPEAKER = "request_tobe_speaker";
    public static final String OP_REQUEST_TOBE_AUDIENCE = "request_tobe_audience";
}
