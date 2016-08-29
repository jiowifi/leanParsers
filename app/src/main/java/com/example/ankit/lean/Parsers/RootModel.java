import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String type;
	public String organizer_description;
	public CreatorModel _creator;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public VersionModel _version;
	public String location_name;
	public String name;
	public String logo;
	public String topic;
	public String end_time;
	public String organizer_name;
	public int id;
	public CopyrightModel _copyright;
	public String start_time;
	public String state;
	public String description;
	public String timezone;

	public RootModel(String privacy, String code_of_conduct, ArrayList<Social_linksModel> social_links, String background_image, String type, String organizer_description, CreatorModel creator, String schedule_published_on, Call_for_papersModel call_for_papers, String email, VersionModel version, String location_name, String name, String logo, String topic, String end_time, String organizer_name, int id, CopyrightModel copyright, String start_time, String state, String description, String timezone) {

		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.background_image = background_image;
		this.type = type;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this._version = version;
		this.location_name = location_name;
		this.name = name;
		this.logo = logo;
		this.topic = topic;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.id = id;
		this._copyright = copyright;
		this.start_time = start_time;
		this.state = state;
		this.description = description;
		this.timezone = timezone;

	}

}