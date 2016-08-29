import java.util.ArrayList;

class RootModel {

	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String organizer_description;
	public String code_of_conduct;
	public String timezone;
	public String description;
	public String name;
	public String email;
	public String type;
	public String location_name;
	public String start_time;
	public CreatorModel _creator;
	public String topic;
	public String background_image;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String state;
	public String schedule_published_on;
	public String organizer_name;
	public int id;
	public CopyrightModel _copyright;

	public RootModel(String logo, ArrayList<Social_linksModel> social_links, VersionModel version, String organizer_description, String code_of_conduct, String timezone, String description, String name, String email, String type, String location_name, String start_time, CreatorModel creator, String topic, String background_image, String privacy, Call_for_papersModel call_for_papers, String end_time, String state, String schedule_published_on, String organizer_name, int id, CopyrightModel copyright) {

		this.logo = logo;
		this.social_links = social_links;
		this._version = version;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.description = description;
		this.name = name;
		this.email = email;
		this.type = type;
		this.location_name = location_name;
		this.start_time = start_time;
		this._creator = creator;
		this.topic = topic;
		this.background_image = background_image;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.id = id;
		this._copyright = copyright;

	}

}