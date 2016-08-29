import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String location_name;
	public String privacy;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String logo;
	public String type;
	public String organizer_description;
	public VersionModel _version;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String start_time;
	public String topic;
	public int id;
	public String code_of_conduct;
	public String timezone;
	public String end_time;
	public String schedule_published_on;
	public String state;
	public String name;
	public String organizer_name;

	public RootModel(String background_image, String location_name, String privacy, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, CreatorModel creator, String logo, String type, String organizer_description, VersionModel version, String description, Call_for_papersModel call_for_papers, String email, String start_time, String topic, int id, String code_of_conduct, String timezone, String end_time, String schedule_published_on, String state, String name, String organizer_name) {

		this.background_image = background_image;
		this.location_name = location_name;
		this.privacy = privacy;
		this._copyright = copyright;
		this.social_links = social_links;
		this._creator = creator;
		this.logo = logo;
		this.type = type;
		this.organizer_description = organizer_description;
		this._version = version;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.start_time = start_time;
		this.topic = topic;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.name = name;
		this.organizer_name = organizer_name;

	}

}