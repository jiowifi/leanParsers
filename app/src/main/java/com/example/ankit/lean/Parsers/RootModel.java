import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String email;
	public CreatorModel _creator;
	public String name;
	public String type;
	public String organizer_name;
	public VersionModel _version;
	public String code_of_conduct;
	public int id;
	public String end_time;
	public String privacy;
	public String topic;
	public String timezone;
	public String start_time;
	public String logo;
	public String description;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public CopyrightModel _copyright;

	public RootModel(String background_image, String email, CreatorModel creator, String name, String type, String organizer_name, VersionModel version, String code_of_conduct, int id, String end_time, String privacy, String topic, String timezone, String start_time, String logo, String description, String schedule_published_on, Call_for_papersModel call_for_papers, String location_name, String organizer_description, ArrayList<Social_linksModel> social_links, String state, CopyrightModel copyright) {

		this.background_image = background_image;
		this.email = email;
		this._creator = creator;
		this.name = name;
		this.type = type;
		this.organizer_name = organizer_name;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.end_time = end_time;
		this.privacy = privacy;
		this.topic = topic;
		this.timezone = timezone;
		this.start_time = start_time;
		this.logo = logo;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.state = state;
		this._copyright = copyright;

	}

}