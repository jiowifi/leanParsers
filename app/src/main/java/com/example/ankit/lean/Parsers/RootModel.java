import java.util.ArrayList;

class RootModel {

	public String email;
	public String topic;
	public String location_name;
	public String privacy;
	public String description;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String start_time;
	public VersionModel _version;
	public String organizer_name;
	public String name;
	public String state;
	public String timezone;
	public String logo;
	public String organizer_description;
	public String end_time;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String type;
	public int id;

	public RootModel(String email, String topic, String location_name, String privacy, String description, String code_of_conduct, CreatorModel creator, String start_time, VersionModel version, String organizer_name, String name, String state, String timezone, String logo, String organizer_description, String end_time, String background_image, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String schedule_published_on, String type, int id) {

		this.email = email;
		this.topic = topic;
		this.location_name = location_name;
		this.privacy = privacy;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.start_time = start_time;
		this._version = version;
		this.organizer_name = organizer_name;
		this.name = name;
		this.state = state;
		this.timezone = timezone;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.id = id;

	}

}