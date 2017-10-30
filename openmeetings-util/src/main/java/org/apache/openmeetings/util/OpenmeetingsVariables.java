/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License") +  you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.openmeetings.util;

import com.github.openjson.JSONObject;

public class OpenmeetingsVariables {
	public static final String ATTR_CLASS = "class";
	public static final String ATTR_TITLE = "title";
	public static final String CONFIG_CRYPT = "crypt.class.name";
	public static final String CONFIG_DASHBOARD_SHOW_CHAT = "dashboard.show.chat";
	public static final String CONFIG_DASHBOARD_SHOW_MYROOMS = "dashboard.show.myrooms";
	public static final String CONFIG_DASHBOARD_SHOW_RSS = "dashboard.show.rssfeed";
	public static final String CONFIG_DASHBOARD_RSS_FEED1 = "dashboard.rss.feed1";
	public static final String CONFIG_DASHBOARD_RSS_FEED2 = "dashboard.rss.feed2";
	public static final String CONFIG_DEFAULT_LANG = "default.lang.id";
	public static final String CONFIG_DEFAULT_LANDING_ZONE = "default.landing.zone";
	public static final String CONFIG_DEFAULT_LDAP_ID = "default.ldap.id";
	public static final String CONFIG_DEFAULT_GROUP_ID = "default.group.id";
	public static final String CONFIG_DEFAULT_TIMEZONE = "default.timezone";
	public static final String CONFIG_REGISTER_FRONTEND = "allow.frontend.register";
	public static final String CONFIG_REGISTER_SOAP = "allow.soap.register";
	public static final String CONFIG_REGISTER_OAUTH = "allow.oauth.register";
	public static final String CONFIG_MAX_UPLOAD_SIZE = "max.upload.size";
	public static final String CONFIG_SIP_ENABLED = "sip.enable";
	public static final String CONFIG_SIP_ROOM_PREFIX = "sip.room.prefix";
	public static final String CONFIG_SIP_EXTEN_CONTEXT = "sip.exten.context";
	public static final String CONFIG_LOGIN_MIN_LENGTH = "user.login.minimum.length";
	public static final String CONFIG_PASS_MIN_LENGTH = "user.pass.minimum.length";
	public static final String CONFIG_IGNORE_BAD_SSL = "oauth2.ignore.bad.ssl";
	public static final String CONFIG_REDIRECT_URL_FOR_EXTERNAL = "redirect.url.for.external.users";
	public static final String CONFIG_APPOINTMENT_REMINDER_MINUTES = "number.minutes.reminder.send";
	public static final String CONFIG_APPLICATION_NAME = "application.name";
	public static final String CONFIG_APPLICATION_BASE_URL = "application.base.url";
	public static final String CONFIG_SCREENSHARING_QUALITY = "screensharing.default.quality";
	public static final String CONFIG_SCREENSHARING_FPS = "screensharing.default.fps";
	public static final String CONFIG_SCREENSHARING_FPS_SHOW = "screensharing.fps.show";
	public static final String CONFIG_SCREENSHARING_ALLOW_REMOTE = "screensharing.allow.remote";
	public static final String CONFIG_CALENDAR_FIRST_DAY = "calendar.firstday";
	public static final String CONFIG_GOOGLE_ANALYTICS_CODE = "google.analytics.code";
	public static final String CONFIG_SMTP_SERVER = "mail.smtp.server";
	public static final String CONFIG_SMTP_PORT = "mail.smtp.port";
	public static final String CONFIG_SMTP_USER = "mail.smtp.user";
	public static final String CONFIG_SMTP_PASS = "mail.smtp.pass";
	public static final String CONFIG_SMTP_SYSTEM_EMAIL = "mail.smtp.system.email";
	public static final String CONFIG_SMTP_TLS = "mail.smtp.starttls.enable";
	public static final String CONFIG_SMTP_TIMEOUT_CON = "mail.smtp.connection.timeout";
	public static final String CONFIG_SMTP_TIMEOUT = "mail.smtp.timeout";
	public static final String CONFIG_PATH_IMAGEMAGIC = "path.imagemagick";
	public static final String CONFIG_PATH_SOX = "path.sox";
	public static final String CONFIG_PATH_FFMPEG = "path.ffmpeg";
	public static final String CONFIG_PATH_OFFICE = "path.office";
	public static final String CONFIG_DOCUMENT_DPI = "document.dpi";
	public static final String CONFIG_DOCUMENT_QUALITY = "document.quality";
	public static final String CONFIG_FLASH_SECURE = "flash.secure";
	public static final String CONFIG_FLASH_SECURE_PROXY = "flash.secure.proxy";
	public static final String CONFIG_FLASH_VIDEO_CODEC = "flash.video.codec";
	public static final String CONFIG_FLASH_VIDEO_FPS = "flash.video.fps";
	public static final String CONFIG_FLASH_VIDEO_BANDWIDTH = "flash.video.bandwidth";
	public static final String CONFIG_FLASH_CAM_QUALITY = "flash.cam.quality";
	public static final String CONFIG_FLASH_MIC_RATE = "flash.mic.rate";
	public static final String CONFIG_FLASH_ECHO_PATH = "flash.echoPath";
	public static final String CONFIG_HEADER_XFRAME = "header.x.frame.options";
	public static final String CONFIG_EXT_PROCESS_TTL = "external.process.ttl";
	public static final String CONFIG_HEADER_CSP = "header.content.security.policy";
	public static final String CONFIG_EMAIL_AT_REGISTER = "send.email.at.register";
	public static final String CONFIG_EMAIL_VERIFICATION = "send.email.with.verfication";
	public static final String CONFIG_CALENDAR_ROOM_CAPACITY = "calendar.conference.rooms.default.size";
	public static final String CONFIG_REPLY_TO_ORGANIZER = "inviter.email.as.replyto";
	public static final String CONFIG_KEYCODE_ARRANGE = "video.arrange.keycode";
	public static final String CONFIG_KEYCODE_EXCLUSIVE = "exclusive.audio.keycode";
	public static final String CONFIG_KEYCODE_MUTE = "mute.keycode";
	public static final String CONFIG_MYROOMS_ENABLED = "personal.rooms.enabled";
	public static final String CONFIG_REMINDER_MESSAGE = "reminder.message";

	public static final String HEADER_XFRAME_SAMEORIGIN = "SAMEORIGIN";
	public static final String HEADER_CSP_SELF = "default-src 'self'; style-src 'self' 'unsafe-inline'; script-src 'self' 'unsafe-inline' 'unsafe-eval'; img-src 'self' data:;";
	public static final int RECENT_ROOMS_COUNT = 5;
	public static final int USER_LOGIN_MINIMUM_LENGTH = 4;
	public static final int USER_PASSWORD_MINIMUM_LENGTH = 8;
	public static final String DEFAULT_APP_NAME = "OpenMeetings";
	public static final String DEFAULT_CONTEXT_NAME = "openmeetings";
	public static final long DEFAULT_MAX_UPLOAD_SIZE = 100 * 1024 * 1024L; // 100MB
	public static final String FLASH_SECURE = "secure";
	public static final String FLASH_NATIVE_SSL = "native";
	public static final String FLASH_PORT = "rtmpPort";
	public static final String FLASH_SSL_PORT = "rtmpsPort";
	public static final String FLASH_VIDEO_CODEC = "videoCodec";
	public static final String FLASH_FPS = "fps";
	public static final String FLASH_BANDWIDTH = "bandwidth";
	public static final String FLASH_QUALITY = "quality";
	public static final String FLASH_ECHO_PATH = "echoPath";
	public static final String FLASH_MIC_RATE = "micRate";
	public static final int DEFAULT_MINUTES_REMINDER_SEND = 15;
	public static final String DEFAULT_BASE_URL = "http://localhost:5080/openmeetings/";

	private static String webAppRootKey = null;
	private static String cryptClassName = null;
	private static String wicketApplicationName = null;
	private static String applicationName = null;
	private static int extProcessTtl = 20;
	private static JSONObject roomSettings = new JSONObject();
	private static boolean initComplete = false;
	private static long maxUploadSize = DEFAULT_MAX_UPLOAD_SIZE;
	private static String baseUrl = DEFAULT_BASE_URL;
	private static boolean sipEnabled = false;
	private static String gaCode = null;
	private static Long defaultLang = 1L;

	private OpenmeetingsVariables() {}

	public static String getApplicationName() {
		return applicationName;
	}

	public static void setApplicationName(String name) {
		applicationName = name;
	}

	public static JSONObject getRoomSettings() {
		return new JSONObject(roomSettings.toString());
	}

	public static void setRoomSettings(JSONObject s) {
		roomSettings = s;
	}

	public static String getCryptClassName() {
		return cryptClassName;
	}

	public static void setCryptClassName(String name) {
		cryptClassName = name;
	}

	public static int getExtProcessTtl() {
		return extProcessTtl;
	}

	public static void setExtProcessTtl(int ttl) {
		extProcessTtl = ttl;
	}

	public static boolean isInitComplete() {
		return initComplete;
	}

	public static void setInitComplete(boolean complete) {
		initComplete = complete;
	}

	public static String getWicketApplicationName() {
		return wicketApplicationName;
	}

	public static void setWicketApplicationName(String name) {
		wicketApplicationName = name;
	}

	public static String getWebAppRootKey() {
		return webAppRootKey;
	}

	public static void setWebAppRootKey(String key) {
		webAppRootKey = key;
	}

	/**
	 *
	 * @return returns the max upload size configured by max_upload_size config key
	 */
	public static long getMaxUploadSize() {
		return maxUploadSize;
	}

	public static void setMaxUploadSize(long size) {
		maxUploadSize = size;
	}

	public static String getBaseUrl() {
		return baseUrl;
	}

	public static void setBaseUrl(String url) {
		baseUrl = url;
	}

	public static boolean isSipEnabled() {
		return sipEnabled;
	}

	public static void setSipEnabled(boolean enabled) {
		sipEnabled = enabled;
	}

	public static String getGaCode() {
		return gaCode;
	}

	public static void setGaCode(String code) {
		gaCode = code;
	}

	public static Long getDefaultLang() {
		return defaultLang;
	}

	public static void setDefaultLang(Long lang) {
		defaultLang = lang;
	}
}
