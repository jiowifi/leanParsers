import java.util.ArrayList;

class RootModel {

	public String email;
	public String start_time;
	public CreatorModel _creator;
	public String background_image;
	public VersionModel _version;
	public String location_name;
	public String organizer_name;
	public String type;
	public String state;
	public String organizer_description;
	public String schedule_published_on;
	public int id;
	public String timezone;
	public String description;
	public String code_of_conduct;
	public String topic;
	public String end_time;
	public String privacy;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;

	public RootModel(String email, String start_time, CreatorModel creator, String background_image, VersionModel version, String location_name, String organizer_name, String type, String state, String organizer_description, String schedule_published_on, int id, String timezone, String description, String code_of_conduct, String topic, String end_time, String privacy, String logo, Call_for_papersModel call_for_papers, String name, ArrayList<Social_linksModel> social_links, CopyrightModel copyright) {

		this.email = email;
		this.start_time = start_time;
		this._creator = creator;
		this.background_image = background_image;
		this._version = version;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.type = type;
		this.state = state;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.timezone = timezone;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.end_time = end_time;
		this.privacy = privacy;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.social_links = social_links;
		this._copyright = copyright;

	}

}