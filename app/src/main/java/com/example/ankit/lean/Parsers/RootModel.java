import java.util.ArrayList;

class RootModel {

	public String location_name;
	public VersionModel _version;
	public String email;
	public String description;
	public String code_of_conduct;
	public String end_time;
	public String schedule_published_on;
	public String logo;
	public int id;
	public String organizer_description;
	public String background_image;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String start_time;
	public String state;
	public CreatorModel _creator;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String timezone;
	public String type;
	public CopyrightModel _copyright;

	public RootModel(String location_name, VersionModel version, String email, String description, String code_of_conduct, String end_time, String schedule_published_on, String logo, int id, String organizer_description, String background_image, String privacy, Call_for_papersModel call_for_papers, String organizer_name, String start_time, String state, CreatorModel creator, String name, ArrayList<Social_linksModel> social_links, String topic, String timezone, String type, CopyrightModel copyright) {

		this.location_name = location_name;
		this._version = version;
		this.email = email;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.id = id;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.state = state;
		this._creator = creator;
		this.name = name;
		this.social_links = social_links;
		this.topic = topic;
		this.timezone = timezone;
		this.type = type;
		this._copyright = copyright;

	}

}