import java.util.ArrayList;

class RootModel {

	public String timezone;
	public VersionModel _version;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String name;
	public String code_of_conduct;
	public String end_time;
	public String description;
	public String type;
	public String organizer_description;
	public String logo;
	public String organizer_name;
	public String email;
	public String privacy;
	public CreatorModel _creator;
	public String location_name;
	public String schedule_published_on;
	public String topic;
	public String start_time;
	public int id;

	public RootModel(String timezone, VersionModel version, String state, Call_for_papersModel call_for_papers, String background_image, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String name, String code_of_conduct, String end_time, String description, String type, String organizer_description, String logo, String organizer_name, String email, String privacy, CreatorModel creator, String location_name, String schedule_published_on, String topic, String start_time, int id) {

		this.timezone = timezone;
		this._version = version;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.social_links = social_links;
		this._copyright = copyright;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.description = description;
		this.type = type;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this.email = email;
		this.privacy = privacy;
		this._creator = creator;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.start_time = start_time;
		this.id = id;

	}

}