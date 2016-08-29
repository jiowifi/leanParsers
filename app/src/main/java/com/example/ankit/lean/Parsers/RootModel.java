import java.util.ArrayList;

class RootModel {

	public String email;
	public String end_time;
	public String organizer_description;
	public String timezone;
	public VersionModel _version;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String type;
	public CreatorModel _creator;
	public String privacy;
	public String logo;
	public String organizer_name;
	public String code_of_conduct;
	public String schedule_published_on;
	public String topic;
	public String description;
	public String background_image;
	public String state;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public CopyrightModel _copyright;

	public RootModel(String email, String end_time, String organizer_description, String timezone, VersionModel version, int id, Call_for_papersModel call_for_papers, String name, String type, CreatorModel creator, String privacy, String logo, String organizer_name, String code_of_conduct, String schedule_published_on, String topic, String description, String background_image, String state, String start_time, ArrayList<Social_linksModel> social_links, String location_name, CopyrightModel copyright) {

		this.email = email;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this._version = version;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.type = type;
		this._creator = creator;
		this.privacy = privacy;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.description = description;
		this.background_image = background_image;
		this.state = state;
		this.start_time = start_time;
		this.social_links = social_links;
		this.location_name = location_name;
		this._copyright = copyright;

	}

}