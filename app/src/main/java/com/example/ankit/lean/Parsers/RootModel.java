import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String topic;
	public String state;
	public String type;
	public String end_time;
	public String privacy;
	public CopyrightModel _copyright;
	public String timezone;
	public VersionModel _version;
	public String email;
	public String logo;
	public String description;
	public String location_name;
	public String organizer_name;
	public String background_image;
	public int id;

	public RootModel(String start_time, String code_of_conduct, CreatorModel creator, String schedule_published_on, Call_for_papersModel call_for_papers, String organizer_description, ArrayList<Social_linksModel> social_links, String name, String topic, String state, String type, String end_time, String privacy, CopyrightModel copyright, String timezone, VersionModel version, String email, String logo, String description, String location_name, String organizer_name, String background_image, int id) {

		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.name = name;
		this.topic = topic;
		this.state = state;
		this.type = type;
		this.end_time = end_time;
		this.privacy = privacy;
		this._copyright = copyright;
		this.timezone = timezone;
		this._version = version;
		this.email = email;
		this.logo = logo;
		this.description = description;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.id = id;

	}

}