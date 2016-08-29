import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String end_time;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public String schedule_published_on;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public CreatorModel _creator;
	public String privacy;
	public String topic;
	public String timezone;
	public String background_image;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String logo;
	public String name;
	public String state;
	public int id;
	public String email;
	public String organizer_name;
	public String start_time;

	public RootModel(String location_name, String end_time, String code_of_conduct, Call_for_papersModel call_for_papers, String description, String schedule_published_on, String type, ArrayList<Social_linksModel> social_links, String organizer_description, CreatorModel creator, String privacy, String topic, String timezone, String background_image, VersionModel version, CopyrightModel copyright, String logo, String name, String state, int id, String email, String organizer_name, String start_time) {

		this.location_name = location_name;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.privacy = privacy;
		this.topic = topic;
		this.timezone = timezone;
		this.background_image = background_image;
		this._version = version;
		this._copyright = copyright;
		this.logo = logo;
		this.name = name;
		this.state = state;
		this.id = id;
		this.email = email;
		this.organizer_name = organizer_name;
		this.start_time = start_time;

	}

}