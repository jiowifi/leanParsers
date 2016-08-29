import java.util.ArrayList;

class RootModel {

	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String logo;
	public String topic;
	public String background_image;
	public String timezone;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String schedule_published_on;
	public String type;
	public VersionModel _version;
	public String start_time;
	public String organizer_name;
	public CreatorModel _creator;
	public String state;
	public String name;
	public String email;
	public String description;
	public int id;
	public String code_of_conduct;
	public CopyrightModel _copyright;

	public RootModel(String end_time, Call_for_papersModel call_for_papers, String privacy, String logo, String topic, String background_image, String timezone, String location_name, ArrayList<Social_linksModel> social_links, String organizer_description, String schedule_published_on, String type, VersionModel version, String start_time, String organizer_name, CreatorModel creator, String state, String name, String email, String description, int id, String code_of_conduct, CopyrightModel copyright) {

		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.logo = logo;
		this.topic = topic;
		this.background_image = background_image;
		this.timezone = timezone;
		this.location_name = location_name;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this._version = version;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.state = state;
		this.name = name;
		this.email = email;
		this.description = description;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;

	}

}