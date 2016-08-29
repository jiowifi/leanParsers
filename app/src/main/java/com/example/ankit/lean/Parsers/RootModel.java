import java.util.ArrayList;

class RootModel {

	public String topic;
	public String start_time;
	public String organizer_description;
	public String name;
	public String location_name;
	public String description;
	public String end_time;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public VersionModel _version;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String email;
	public CreatorModel _creator;
	public String privacy;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String timezone;
	public String background_image;
	public String type;
	public int id;

	public RootModel(String topic, String start_time, String organizer_description, String name, String location_name, String description, String end_time, String organizer_name, Call_for_papersModel call_for_papers, String state, VersionModel version, String code_of_conduct, CopyrightModel copyright, String email, CreatorModel creator, String privacy, String schedule_published_on, ArrayList<Social_linksModel> social_links, String logo, String timezone, String background_image, String type, int id) {

		this.topic = topic;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.name = name;
		this.location_name = location_name;
		this.description = description;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.email = email;
		this._creator = creator;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.logo = logo;
		this.timezone = timezone;
		this.background_image = background_image;
		this.type = type;
		this.id = id;

	}

}