import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String description;
	public String state;
	public String background_image;
	public String logo;
	public String timezone;
	public String email;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String location_name;
	public String start_time;
	public CreatorModel _creator;
	public VersionModel _version;
	public String organizer_name;
	public int id;
	public String topic;
	public String privacy;
	public String schedule_published_on;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public CopyrightModel _copyright;

	public RootModel(String organizer_description, String description, String state, String background_image, String logo, String timezone, String email, String type, Call_for_papersModel call_for_papers, String name, String location_name, String start_time, CreatorModel creator, VersionModel version, String organizer_name, int id, String topic, String privacy, String schedule_published_on, String code_of_conduct, ArrayList<Social_linksModel> social_links, String end_time, CopyrightModel copyright) {

		this.organizer_description = organizer_description;
		this.description = description;
		this.state = state;
		this.background_image = background_image;
		this.logo = logo;
		this.timezone = timezone;
		this.email = email;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.location_name = location_name;
		this.start_time = start_time;
		this._creator = creator;
		this._version = version;
		this.organizer_name = organizer_name;
		this.id = id;
		this.topic = topic;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.end_time = end_time;
		this._copyright = copyright;

	}

}