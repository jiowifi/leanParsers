import java.util.ArrayList;

class RootModel {

	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String state;
	public String type;
	public String code_of_conduct;
	public String description;
	public int id;
	public String schedule_published_on;
	public String background_image;
	public String logo;
	public String privacy;
	public String organizer_description;
	public String location_name;
	public String email;
	public String name;
	public CreatorModel _creator;
	public String start_time;
	public VersionModel _version;
	public String topic;
	public String timezone;

	public RootModel(String end_time, ArrayList<Social_linksModel> social_links, String organizer_name, Call_for_papersModel call_for_papers, CopyrightModel copyright, String state, String type, String code_of_conduct, String description, int id, String schedule_published_on, String background_image, String logo, String privacy, String organizer_description, String location_name, String email, String name, CreatorModel creator, String start_time, VersionModel version, String topic, String timezone) {

		this.end_time = end_time;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.state = state;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.logo = logo;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.email = email;
		this.name = name;
		this._creator = creator;
		this.start_time = start_time;
		this._version = version;
		this.topic = topic;
		this.timezone = timezone;

	}

}