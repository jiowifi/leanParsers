import java.util.ArrayList;

class RootModel {

	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String logo;
	public String description;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String topic;
	public String type;
	public String organizer_description;
	public CreatorModel _creator;
	public String organizer_name;
	public String timezone;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String state;
	public String email;
	public String start_time;
	public String end_time;
	public String code_of_conduct;
	public String privacy;
	public String location_name;

	public RootModel(int id, ArrayList<Social_linksModel> social_links, String background_image, String logo, String description, CopyrightModel copyright, String schedule_published_on, String topic, String type, String organizer_description, CreatorModel creator, String organizer_name, String timezone, String name, Call_for_papersModel call_for_papers, VersionModel version, String state, String email, String start_time, String end_time, String code_of_conduct, String privacy, String location_name) {

		this.id = id;
		this.social_links = social_links;
		this.background_image = background_image;
		this.logo = logo;
		this.description = description;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.type = type;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.state = state;
		this.email = email;
		this.start_time = start_time;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.location_name = location_name;

	}

}