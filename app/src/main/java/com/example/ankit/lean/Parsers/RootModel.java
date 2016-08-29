import java.util.ArrayList;

class RootModel {

	public String description;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String organizer_name;
	public String background_image;
	public String end_time;
	public String timezone;
	public String code_of_conduct;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String email;
	public String logo;
	public String state;
	public String start_time;
	public String topic;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public int id;

	public RootModel(String description, String schedule_published_on, CreatorModel creator, String organizer_name, String background_image, String end_time, String timezone, String code_of_conduct, String location_name, Call_for_papersModel call_for_papers, String name, VersionModel version, CopyrightModel copyright, String organizer_description, String email, String logo, String state, String start_time, String topic, String privacy, ArrayList<Social_linksModel> social_links, String type, int id) {

		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.end_time = end_time;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this._version = version;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.email = email;
		this.logo = logo;
		this.state = state;
		this.start_time = start_time;
		this.topic = topic;
		this.privacy = privacy;
		this.social_links = social_links;
		this.type = type;
		this.id = id;

	}

}