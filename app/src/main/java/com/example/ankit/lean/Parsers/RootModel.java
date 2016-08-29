import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String start_time;
	public CreatorModel _creator;
	public String organizer_description;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public String state;
	public String location_name;
	public String background_image;
	public String type;
	public String name;
	public String organizer_name;
	public String timezone;
	public String privacy;
	public int id;
	public String code_of_conduct;
	public String description;
	public String topic;
	public VersionModel _version;

	public RootModel(String end_time, String start_time, CreatorModel creator, String organizer_description, String email, ArrayList<Social_linksModel> social_links, String logo, CopyrightModel copyright, Call_for_papersModel call_for_papers, String schedule_published_on, String state, String location_name, String background_image, String type, String name, String organizer_name, String timezone, String privacy, int id, String code_of_conduct, String description, String topic, VersionModel version) {

		this.end_time = end_time;
		this.start_time = start_time;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.email = email;
		this.social_links = social_links;
		this.logo = logo;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.location_name = location_name;
		this.background_image = background_image;
		this.type = type;
		this.name = name;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.privacy = privacy;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.topic = topic;
		this._version = version;

	}

}