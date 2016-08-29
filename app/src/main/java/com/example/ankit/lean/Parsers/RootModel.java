import java.util.ArrayList;

class RootModel {

	public int id;
	public String timezone;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String name;
	public CreatorModel _creator;
	public String organizer_description;
	public String start_time;
	public String email;
	public VersionModel _version;
	public String organizer_name;
	public String topic;
	public String end_time;
	public String logo;
	public String state;
	public String description;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String type;
	public String schedule_published_on;
	public CopyrightModel _copyright;

	public RootModel(int id, String timezone, String location_name, Call_for_papersModel call_for_papers, String privacy, String name, CreatorModel creator, String organizer_description, String start_time, String email, VersionModel version, String organizer_name, String topic, String end_time, String logo, String state, String description, String code_of_conduct, ArrayList<Social_linksModel> social_links, String background_image, String type, String schedule_published_on, CopyrightModel copyright) {

		this.id = id;
		this.timezone = timezone;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.name = name;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.email = email;
		this._version = version;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.end_time = end_time;
		this.logo = logo;
		this.state = state;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.background_image = background_image;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;

	}

}