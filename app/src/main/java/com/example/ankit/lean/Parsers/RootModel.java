import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String organizer_description;
	public String privacy;
	public String organizer_name;
	public String name;
	public String start_time;
	public VersionModel _version;
	public String code_of_conduct;
	public int id;
	public String location_name;
	public String state;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String end_time;
	public String schedule_published_on;
	public String email;
	public String logo;
	public String description;
	public CreatorModel _creator;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;

	public RootModel(String background_image, String organizer_description, String privacy, String organizer_name, String name, String start_time, VersionModel version, String code_of_conduct, int id, String location_name, String state, String timezone, Call_for_papersModel call_for_papers, String type, String end_time, String schedule_published_on, String email, String logo, String description, CreatorModel creator, String topic, ArrayList<Social_linksModel> social_links, CopyrightModel copyright) {

		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.name = name;
		this.start_time = start_time;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.location_name = location_name;
		this.state = state;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.logo = logo;
		this.description = description;
		this._creator = creator;
		this.topic = topic;
		this.social_links = social_links;
		this._copyright = copyright;

	}

}