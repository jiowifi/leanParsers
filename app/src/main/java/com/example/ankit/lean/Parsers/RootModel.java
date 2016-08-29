import java.util.ArrayList;

class RootModel {

	public int id;
	public String timezone;
	public String privacy;
	public String background_image;
	public String description;
	public String state;
	public String logo;
	public String name;
	public String end_time;
	public VersionModel _version;
	public String email;
	public CreatorModel _creator;
	public String type;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String code_of_conduct;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String schedule_published_on;
	public String location_name;
	public CopyrightModel _copyright;

	public RootModel(int id, String timezone, String privacy, String background_image, String description, String state, String logo, String name, String end_time, VersionModel version, String email, CreatorModel creator, String type, String topic, Call_for_papersModel call_for_papers, String organizer_name, String code_of_conduct, String start_time, ArrayList<Social_linksModel> social_links, String organizer_description, String schedule_published_on, String location_name, CopyrightModel copyright) {

		this.id = id;
		this.timezone = timezone;
		this.privacy = privacy;
		this.background_image = background_image;
		this.description = description;
		this.state = state;
		this.logo = logo;
		this.name = name;
		this.end_time = end_time;
		this._version = version;
		this.email = email;
		this._creator = creator;
		this.type = type;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this._copyright = copyright;

	}

}