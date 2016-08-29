import java.util.ArrayList;

class RootModel {

	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String end_time;
	public String organizer_description;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String organizer_name;
	public String name;
	public String background_image;
	public VersionModel _version;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String timezone;
	public String location_name;
	public String email;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String topic;
	public String privacy;
	public String description;
	public int id;

	public RootModel(String state, ArrayList<Social_linksModel> social_links, String type, String end_time, String organizer_description, String logo, Call_for_papersModel call_for_papers, String start_time, String organizer_name, String name, String background_image, VersionModel version, String schedule_published_on, CreatorModel creator, String timezone, String location_name, String email, String code_of_conduct, CopyrightModel copyright, String topic, String privacy, String description, int id) {

		this.state = state;
		this.social_links = social_links;
		this.type = type;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.name = name;
		this.background_image = background_image;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.timezone = timezone;
		this.location_name = location_name;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.topic = topic;
		this.privacy = privacy;
		this.description = description;
		this.id = id;

	}

}