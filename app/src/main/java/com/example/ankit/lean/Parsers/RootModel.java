import java.util.ArrayList;

class RootModel {

	public String type;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public CreatorModel _creator;
	public VersionModel _version;
	public String location_name;
	public String end_time;
	public int id;
	public String start_time;
	public String background_image;
	public String state;
	public String code_of_conduct;
	public String name;
	public String logo;
	public String topic;
	public String organizer_name;
	public String schedule_published_on;
	public String privacy;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public CopyrightModel _copyright;

	public RootModel(String type, String organizer_description, ArrayList<Social_linksModel> social_links, String timezone, CreatorModel creator, VersionModel version, String location_name, String end_time, int id, String start_time, String background_image, String state, String code_of_conduct, String name, String logo, String topic, String organizer_name, String schedule_published_on, String privacy, String email, Call_for_papersModel call_for_papers, String description, CopyrightModel copyright) {

		this.type = type;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.timezone = timezone;
		this._creator = creator;
		this._version = version;
		this.location_name = location_name;
		this.end_time = end_time;
		this.id = id;
		this.start_time = start_time;
		this.background_image = background_image;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.logo = logo;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this._copyright = copyright;

	}

}