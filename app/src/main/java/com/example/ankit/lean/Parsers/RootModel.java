import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String background_image;
	public String logo;
	public String name;
	public String state;
	public int id;
	public String location_name;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String type;
	public String start_time;
	public String schedule_published_on;
	public String organizer_name;
	public String topic;
	public String end_time;
	public String email;
	public String organizer_description;
	public String description;
	public CreatorModel _creator;
	public String code_of_conduct;
	public CopyrightModel _copyright;

	public RootModel(String timezone, String background_image, String logo, String name, String state, int id, String location_name, VersionModel version, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String privacy, String type, String start_time, String schedule_published_on, String organizer_name, String topic, String end_time, String email, String organizer_description, String description, CreatorModel creator, String code_of_conduct, CopyrightModel copyright) {

		this.timezone = timezone;
		this.background_image = background_image;
		this.logo = logo;
		this.name = name;
		this.state = state;
		this.id = id;
		this.location_name = location_name;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.privacy = privacy;
		this.type = type;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.end_time = end_time;
		this.email = email;
		this.organizer_description = organizer_description;
		this.description = description;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;

	}

}