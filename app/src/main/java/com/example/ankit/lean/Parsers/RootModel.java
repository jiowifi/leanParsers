import java.util.ArrayList;

class RootModel {

	public String email;
	public String logo;
	public String location_name;
	public String timezone;
	public String organizer_name;
	public String start_time;
	public CreatorModel _creator;
	public String state;
	public String topic;
	public String name;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String type;
	public String background_image;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public int id;
	public String code_of_conduct;
	public String schedule_published_on;
	public String end_time;
	public CopyrightModel _copyright;

	public RootModel(String email, String logo, String location_name, String timezone, String organizer_name, String start_time, CreatorModel creator, String state, String topic, String name, String description, Call_for_papersModel call_for_papers, String organizer_description, String type, String background_image, String privacy, ArrayList<Social_linksModel> social_links, VersionModel version, int id, String code_of_conduct, String schedule_published_on, String end_time, CopyrightModel copyright) {

		this.email = email;
		this.logo = logo;
		this.location_name = location_name;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this._creator = creator;
		this.state = state;
		this.topic = topic;
		this.name = name;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.type = type;
		this.background_image = background_image;
		this.privacy = privacy;
		this.social_links = social_links;
		this._version = version;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this._copyright = copyright;

	}

}