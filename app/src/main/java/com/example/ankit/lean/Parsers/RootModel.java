import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String email;
	public String location_name;
	public String background_image;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String description;
	public String code_of_conduct;
	public String topic;
	public String type;
	public String start_time;
	public String organizer_name;
	public String schedule_published_on;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String logo;
	public String timezone;
	public String privacy;
	public String state;
	public int id;

	public RootModel(String organizer_description, String email, String location_name, String background_image, String end_time, Call_for_papersModel call_for_papers, String name, String description, String code_of_conduct, String topic, String type, String start_time, String organizer_name, String schedule_published_on, VersionModel version, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, CreatorModel creator, String logo, String timezone, String privacy, String state, int id) {

		this.organizer_description = organizer_description;
		this.email = email;
		this.location_name = location_name;
		this.background_image = background_image;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.type = type;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this._copyright = copyright;
		this.social_links = social_links;
		this._creator = creator;
		this.logo = logo;
		this.timezone = timezone;
		this.privacy = privacy;
		this.state = state;
		this.id = id;

	}

}