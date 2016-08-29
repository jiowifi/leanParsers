import java.util.ArrayList;

class RootModel {

	public String email;
	public String logo;
	public String timezone;
	public String description;
	public String type;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String schedule_published_on;
	public String state;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String topic;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String organizer_name;
	public String background_image;
	public String location_name;
	public String organizer_description;
	public String privacy;
	public CreatorModel _creator;
	public int id;

	public RootModel(String email, String logo, String timezone, String description, String type, String name, ArrayList<Social_linksModel> social_links, VersionModel version, String schedule_published_on, String state, String code_of_conduct, CopyrightModel copyright, String topic, String end_time, Call_for_papersModel call_for_papers, String start_time, String organizer_name, String background_image, String location_name, String organizer_description, String privacy, CreatorModel creator, int id) {

		this.email = email;
		this.logo = logo;
		this.timezone = timezone;
		this.description = description;
		this.type = type;
		this.name = name;
		this.social_links = social_links;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.topic = topic;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this._creator = creator;
		this.id = id;

	}

}