import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String description;
	public String end_time;
	public String privacy;
	public String topic;
	public String logo;
	public CreatorModel _creator;
	public String organizer_description;
	public String state;
	public String type;
	public VersionModel _version;
	public String name;
	public String schedule_published_on;
	public String start_time;
	public int id;
	public String code_of_conduct;
	public String timezone;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String email;
	public CopyrightModel _copyright;

	public RootModel(String organizer_name, String description, String end_time, String privacy, String topic, String logo, CreatorModel creator, String organizer_description, String state, String type, VersionModel version, String name, String schedule_published_on, String start_time, int id, String code_of_conduct, String timezone, String location_name, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String background_image, String email, CopyrightModel copyright) {

		this.organizer_name = organizer_name;
		this.description = description;
		this.end_time = end_time;
		this.privacy = privacy;
		this.topic = topic;
		this.logo = logo;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.state = state;
		this.type = type;
		this._version = version;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.background_image = background_image;
		this.email = email;
		this._copyright = copyright;

	}

}