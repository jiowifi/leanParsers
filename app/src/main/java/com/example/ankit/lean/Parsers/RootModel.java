import java.util.ArrayList;

class RootModel {

	public String state;
	public CopyrightModel _copyright;
	public int id;
	public String privacy;
	public String organizer_name;
	public String topic;
	public String schedule_published_on;
	public String end_time;
	public String logo;
	public VersionModel _version;
	public String location_name;
	public CreatorModel _creator;
	public String type;
	public String organizer_description;
	public String background_image;
	public String code_of_conduct;
	public String description;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String timezone;

	public RootModel(String state, CopyrightModel copyright, int id, String privacy, String organizer_name, String topic, String schedule_published_on, String end_time, String logo, VersionModel version, String location_name, CreatorModel creator, String type, String organizer_description, String background_image, String code_of_conduct, String description, String name, Call_for_papersModel call_for_papers, String start_time, ArrayList<Social_linksModel> social_links, String email, String timezone) {

		this.state = state;
		this._copyright = copyright;
		this.id = id;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.logo = logo;
		this._version = version;
		this.location_name = location_name;
		this._creator = creator;
		this.type = type;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.social_links = social_links;
		this.email = email;
		this.timezone = timezone;

	}

}