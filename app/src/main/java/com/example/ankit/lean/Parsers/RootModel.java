import java.util.ArrayList;

class RootModel {

	public String state;
	public String background_image;
	public String code_of_conduct;
	public String organizer_description;
	public String schedule_published_on;
	public String timezone;
	public String email;
	public String organizer_name;
	public String privacy;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String end_time;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public int id;
	public String start_time;
	public CreatorModel _creator;
	public String logo;
	public String topic;
	public String name;
	public CopyrightModel _copyright;

	public RootModel(String state, String background_image, String code_of_conduct, String organizer_description, String schedule_published_on, String timezone, String email, String organizer_name, String privacy, String type, ArrayList<Social_linksModel> social_links, String location_name, String end_time, String description, Call_for_papersModel call_for_papers, VersionModel version, int id, String start_time, CreatorModel creator, String logo, String topic, String name, CopyrightModel copyright) {

		this.state = state;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.email = email;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.type = type;
		this.social_links = social_links;
		this.location_name = location_name;
		this.end_time = end_time;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.id = id;
		this.start_time = start_time;
		this._creator = creator;
		this.logo = logo;
		this.topic = topic;
		this.name = name;
		this._copyright = copyright;

	}

}