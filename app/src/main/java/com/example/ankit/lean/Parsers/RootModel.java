import java.util.ArrayList;

class RootModel {

	public int id;
	public CreatorModel _creator;
	public String description;
	public String organizer_name;
	public String background_image;
	public String schedule_published_on;
	public String logo;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String topic;
	public String code_of_conduct;
	public String location_name;
	public String name;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String start_time;
	public VersionModel _version;
	public String privacy;
	public String timezone;
	public CopyrightModel _copyright;
	public String end_time;

	public RootModel(int id, CreatorModel creator, String description, String organizer_name, String background_image, String schedule_published_on, String logo, String organizer_description, Call_for_papersModel call_for_papers, String email, String topic, String code_of_conduct, String location_name, String name, String state, ArrayList<Social_linksModel> social_links, String type, String start_time, VersionModel version, String privacy, String timezone, CopyrightModel copyright, String end_time) {

		this.id = id;
		this._creator = creator;
		this.description = description;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.name = name;
		this.state = state;
		this.social_links = social_links;
		this.type = type;
		this.start_time = start_time;
		this._version = version;
		this.privacy = privacy;
		this.timezone = timezone;
		this._copyright = copyright;
		this.end_time = end_time;

	}

}