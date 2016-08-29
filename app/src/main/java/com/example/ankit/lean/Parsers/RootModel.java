import java.util.ArrayList;

class RootModel {

	public int id;
	public String schedule_published_on;
	public String organizer_description;
	public String name;
	public String end_time;
	public String email;
	public String privacy;
	public VersionModel _version;
	public String organizer_name;
	public CreatorModel _creator;
	public String type;
	public String logo;
	public String location_name;
	public String code_of_conduct;
	public String background_image;
	public String start_time;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String state;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;

	public RootModel(int id, String schedule_published_on, String organizer_description, String name, String end_time, String email, String privacy, VersionModel version, String organizer_name, CreatorModel creator, String type, String logo, String location_name, String code_of_conduct, String background_image, String start_time, String description, Call_for_papersModel call_for_papers, String topic, String state, String timezone, ArrayList<Social_linksModel> social_links, CopyrightModel copyright) {

		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.name = name;
		this.end_time = end_time;
		this.email = email;
		this.privacy = privacy;
		this._version = version;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.type = type;
		this.logo = logo;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.start_time = start_time;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.state = state;
		this.timezone = timezone;
		this.social_links = social_links;
		this._copyright = copyright;

	}

}