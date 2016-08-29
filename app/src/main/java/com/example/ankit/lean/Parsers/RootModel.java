import java.util.ArrayList;

class RootModel {

	public String description;
	public String state;
	public VersionModel _version;
	public String location_name;
	public String privacy;
	public CreatorModel _creator;
	public String background_image;
	public String organizer_description;
	public String end_time;
	public String topic;
	public String email;
	public String start_time;
	public String code_of_conduct;
	public String type;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String organizer_name;
	public String logo;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public int id;

	public RootModel(String description, String state, VersionModel version, String location_name, String privacy, CreatorModel creator, String background_image, String organizer_description, String end_time, String topic, String email, String start_time, String code_of_conduct, String type, CopyrightModel copyright, String schedule_published_on, String organizer_name, String logo, String name, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String timezone, int id) {

		this.description = description;
		this.state = state;
		this._version = version;
		this.location_name = location_name;
		this.privacy = privacy;
		this._creator = creator;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.topic = topic;
		this.email = email;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.name = name;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.id = id;

	}

}