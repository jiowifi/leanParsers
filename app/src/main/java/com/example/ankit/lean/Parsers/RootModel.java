import java.util.ArrayList;

class RootModel {

	public String type;
	public String location_name;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public String state;
	public String start_time;
	public int id;
	public CreatorModel _creator;
	public String organizer_name;
	public VersionModel _version;
	public String email;
	public String name;
	public String end_time;
	public String description;
	public String organizer_description;
	public String privacy;
	public String logo;
	public String timezone;
	public CopyrightModel _copyright;

	public RootModel(String type, String location_name, String topic, ArrayList<Social_linksModel> social_links, String code_of_conduct, String background_image, Call_for_papersModel call_for_papers, String schedule_published_on, String state, String start_time, int id, CreatorModel creator, String organizer_name, VersionModel version, String email, String name, String end_time, String description, String organizer_description, String privacy, String logo, String timezone, CopyrightModel copyright) {

		this.type = type;
		this.location_name = location_name;
		this.topic = topic;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.start_time = start_time;
		this.id = id;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this._version = version;
		this.email = email;
		this.name = name;
		this.end_time = end_time;
		this.description = description;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.logo = logo;
		this.timezone = timezone;
		this._copyright = copyright;

	}

}