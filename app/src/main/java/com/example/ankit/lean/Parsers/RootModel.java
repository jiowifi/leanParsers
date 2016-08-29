import java.util.ArrayList;

class RootModel {

	public String topic;
	public String end_time;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String location_name;
	public String privacy;
	public String type;
	public String state;
	public int id;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String organizer_name;
	public String schedule_published_on;
	public String background_image;
	public String email;
	public String timezone;
	public CreatorModel _creator;
	public String name;
	public String start_time;
	public String code_of_conduct;
	public VersionModel _version;

	public RootModel(String topic, String end_time, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String description, String location_name, String privacy, String type, String state, int id, String logo, Call_for_papersModel call_for_papers, String organizer_description, String organizer_name, String schedule_published_on, String background_image, String email, String timezone, CreatorModel creator, String name, String start_time, String code_of_conduct, VersionModel version) {

		this.topic = topic;
		this.end_time = end_time;
		this._copyright = copyright;
		this.social_links = social_links;
		this.description = description;
		this.location_name = location_name;
		this.privacy = privacy;
		this.type = type;
		this.state = state;
		this.id = id;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.email = email;
		this.timezone = timezone;
		this._creator = creator;
		this.name = name;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this._version = version;

	}

}