package com.mandrill.clients.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MandrillMessage {

	private String text;
	private String subject;
	private String from_email;
	private String from_name;
	private MandrillRecipient[] to;
	private boolean track_opens=true;
	private boolean track_clicks=true;
	private boolean auto_text=false;
	private boolean url_strip_qs=false;
	private String[] tags = new String[0];
	private String[] google_analytics_domains = new String[0];
	private String[] google_analytics_campaign = new String[0];
        private List<MergeVar> global_merge_vars;
        
        private String MANDRILL_SENDER_EMAIL = "james.singh@hotmail.com";
        private String MANDRILL_SENDER_NAME = "MyCompany.com";
	
	private Map<String, String> headers;
	
	public MandrillMessage(){
		this.from_email = MANDRILL_SENDER_EMAIL;
		this.from_name = MANDRILL_SENDER_NAME;
		headers = new HashMap<String, String>();
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getFrom_email() {
		return from_email;
	}
	
	public String getFrom_name() {
		return from_name;
	}
	
	public MandrillRecipient[] getTo() {
		return to;
	}
	
	public void setTo(MandrillRecipient[] to) {
		this.to = to;
	}
	
	public boolean isTrack_opens() {
		return track_opens;
	}
	
	public boolean isTrack_clicks() {
		return track_clicks;
	}
	
	public String[] getTags() {
		return tags;
	}
	
	public void setTags(String[] tags) {
		this.tags = tags;
	}
	
	public Map<String, String> getHeaders() {
		return headers;
	}
	
	public void addHeader(String key, String value) {
		this.headers.put(key, value);
	}

	public boolean isAuto_text() {
		return auto_text;
	}

	public void setAuto_text(boolean auto_text) {
		this.auto_text = auto_text;
	}

	public boolean isUrl_strip_qs() {
		return url_strip_qs;
	}

	public void setUrl_strip_qs(boolean url_strip_qs) {
		this.url_strip_qs = url_strip_qs;
	}

	public String[] getGoogle_analytics_domains() {
		return google_analytics_domains;
	}

	public void setGoogle_analytics_domains(String[] google_analytics_domains) {
		this.google_analytics_domains = google_analytics_domains;
	}

	public String[] getGoogle_analytics_campaign() {
		return google_analytics_campaign;
	}

	public void setGoogle_analytics_campaign(String[] google_analytics_campaign) {
		this.google_analytics_campaign = google_analytics_campaign;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}


    public List<MergeVar> getGlobal_merge_vars() {
        return global_merge_vars;
    }

    public void setGlobal_merge_vars(List<MergeVar> global_merge_vars) {
        this.global_merge_vars = global_merge_vars;
    }
}
