import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public int id;
	public String email;
	public CopyrightModel _copyright;
	public String background_image;
	public String start_time;
	public String privacy;
	public String logo;
	public CreatorModel _creator;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String description;
	public String name;
	public String organizer_description;
	public String state;
	public String location_name;
	public String topic;
	public String type;
	public String timezone;

	public RootModel(String organizer_name, VersionModel version, Call_for_papersModel call_for_papers, String end_time, int id, String email, CopyrightModel copyright, String background_image, String start_time, String privacy, String logo, CreatorModel creator, String schedule_published_on, ArrayList<Social_linksModel> social_links, String code_of_conduct, String description, String name, String organizer_description, String state, String location_name, String topic, String type, String timezone) {

		this.organizer_name = organizer_name;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.id = id;
		this.email = email;
		this._copyright = copyright;
		this.background_image = background_image;
		this.start_time = start_time;
		this.privacy = privacy;
		this.logo = logo;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.name = name;
		this.organizer_description = organizer_description;
		this.state = state;
		this.location_name = location_name;
		this.topic = topic;
		this.type = type;
		this.timezone = timezone;

	}

}