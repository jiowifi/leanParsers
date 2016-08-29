import java.util.ArrayList;

class RootModel {

	public String name;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String start_time;
	public String background_image;
	public String type;
	public String privacy;
	public String schedule_published_on;
	public String description;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String organizer_description;
	public String state;
	public String logo;
	public String timezone;
	public CreatorModel _creator;
	public String organizer_name;
	public String email;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public int id;

	public RootModel(String name, String location_name, Call_for_papersModel call_for_papers, String end_time, String start_time, String background_image, String type, String privacy, String schedule_published_on, String description, VersionModel version, ArrayList<Social_linksModel> social_links, String topic, String organizer_description, String state, String logo, String timezone, CreatorModel creator, String organizer_name, String email, CopyrightModel copyright, String code_of_conduct, int id) {

		this.name = name;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.start_time = start_time;
		this.background_image = background_image;
		this.type = type;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this._version = version;
		this.social_links = social_links;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.state = state;
		this.logo = logo;
		this.timezone = timezone;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.email = email;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.id = id;

	}

}