import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public int id;
	public String schedule_published_on;
	public String location_name;
	public String timezone;
	public VersionModel _version;
	public String privacy;
	public String organizer_name;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String topic;
	public String type;
	public String organizer_description;
	public CreatorModel _creator;
	public String end_time;
	public String logo;
	public String name;
	public String email;
	public String description;

	public RootModel(String code_of_conduct, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String state, int id, String schedule_published_on, String location_name, String timezone, VersionModel version, String privacy, String organizer_name, String background_image, Call_for_papersModel call_for_papers, String start_time, String topic, String type, String organizer_description, CreatorModel creator, String end_time, String logo, String name, String email, String description) {

		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.social_links = social_links;
		this.state = state;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.timezone = timezone;
		this._version = version;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.topic = topic;
		this.type = type;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.end_time = end_time;
		this.logo = logo;
		this.name = name;
		this.email = email;
		this.description = description;

	}

}