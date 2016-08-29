import java.util.ArrayList;

class RootModel {

	public String topic;
	public String description;
	public String background_image;
	public CreatorModel _creator;
	public String location_name;
	public String code_of_conduct;
	public String logo;
	public VersionModel _version;
	public String start_time;
	public String name;
	public String email;
	public String state;
	public String schedule_published_on;
	public String organizer_name;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String privacy;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String end_time;
	public CopyrightModel _copyright;

	public RootModel(String topic, String description, String background_image, CreatorModel creator, String location_name, String code_of_conduct, String logo, VersionModel version, String start_time, String name, String email, String state, String schedule_published_on, String organizer_name, int id, ArrayList<Social_linksModel> social_links, String type, String privacy, String timezone, Call_for_papersModel call_for_papers, String organizer_description, String end_time, CopyrightModel copyright) {

		this.topic = topic;
		this.description = description;
		this.background_image = background_image;
		this._creator = creator;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this._version = version;
		this.start_time = start_time;
		this.name = name;
		this.email = email;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.id = id;
		this.social_links = social_links;
		this.type = type;
		this.privacy = privacy;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this._copyright = copyright;

	}

}