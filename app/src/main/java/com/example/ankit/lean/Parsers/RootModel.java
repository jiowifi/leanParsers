import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public CreatorModel _creator;
	public String location_name;
	public String state;
	public String end_time;
	public String timezone;
	public String topic;
	public VersionModel _version;
	public String description;
	public String email;
	public String organizer_name;
	public String name;
	public String type;
	public String background_image;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String privacy;
	public String start_time;
	public String code_of_conduct;
	public int id;

	public RootModel(String schedule_published_on, CreatorModel creator, String location_name, String state, String end_time, String timezone, String topic, VersionModel version, String description, String email, String organizer_name, String name, String type, String background_image, String logo, Call_for_papersModel call_for_papers, String organizer_description, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String privacy, String start_time, String code_of_conduct, int id) {

		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.location_name = location_name;
		this.state = state;
		this.end_time = end_time;
		this.timezone = timezone;
		this.topic = topic;
		this._version = version;
		this.description = description;
		this.email = email;
		this.organizer_name = organizer_name;
		this.name = name;
		this.type = type;
		this.background_image = background_image;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this._copyright = copyright;
		this.privacy = privacy;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.id = id;

	}

}