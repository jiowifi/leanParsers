import java.util.ArrayList;

class RootModel {

	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String privacy;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String type;
	public String background_image;
	public String start_time;
	public int id;
	public String end_time;
	public String name;
	public String logo;
	public String email;
	public String location_name;
	public String topic;
	public CreatorModel _creator;
	public String organizer_description;
	public String description;
	public VersionModel _version;
	public String timezone;

	public RootModel(String state, ArrayList<Social_linksModel> social_links, String code_of_conduct, Call_for_papersModel call_for_papers, String organizer_name, String privacy, String schedule_published_on, CopyrightModel copyright, String type, String background_image, String start_time, int id, String end_time, String name, String logo, String email, String location_name, String topic, CreatorModel creator, String organizer_description, String description, VersionModel version, String timezone) {

		this.state = state;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.type = type;
		this.background_image = background_image;
		this.start_time = start_time;
		this.id = id;
		this.end_time = end_time;
		this.name = name;
		this.logo = logo;
		this.email = email;
		this.location_name = location_name;
		this.topic = topic;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.description = description;
		this._version = version;
		this.timezone = timezone;

	}

}