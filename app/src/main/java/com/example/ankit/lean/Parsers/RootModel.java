import java.util.ArrayList;

class RootModel {

	public String description;
	public String location_name;
	public String type;
	public String state;
	public String privacy;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String end_time;
	public String code_of_conduct;
	public String logo;
	public String background_image;
	public String organizer_description;
	public VersionModel _version;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String topic;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String email;
	public String start_time;
	public String timezone;

	public RootModel(String description, String location_name, String type, String state, String privacy, CreatorModel creator, String schedule_published_on, String end_time, String code_of_conduct, String logo, String background_image, String organizer_description, VersionModel version, int id, Call_for_papersModel call_for_papers, String name, String topic, String organizer_name, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String email, String start_time, String timezone) {

		this.description = description;
		this.location_name = location_name;
		this.type = type;
		this.state = state;
		this.privacy = privacy;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this._version = version;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this._copyright = copyright;
		this.email = email;
		this.start_time = start_time;
		this.timezone = timezone;

	}

}