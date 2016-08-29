import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String timezone;
	public String start_time;
	public String location_name;
	public String type;
	public String email;
	public String organizer_name;
	public String code_of_conduct;
	public int id;
	public String schedule_published_on;
	public String privacy;
	public String end_time;
	public String state;
	public String description;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public CreatorModel _creator;
	public String logo;
	public String organizer_description;

	public RootModel(VersionModel version, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String topic, String timezone, String start_time, String location_name, String type, String email, String organizer_name, String code_of_conduct, int id, String schedule_published_on, String privacy, String end_time, String state, String description, String name, Call_for_papersModel call_for_papers, String background_image, CreatorModel creator, String logo, String organizer_description) {

		this._version = version;
		this._copyright = copyright;
		this.social_links = social_links;
		this.topic = topic;
		this.timezone = timezone;
		this.start_time = start_time;
		this.location_name = location_name;
		this.type = type;
		this.email = email;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.end_time = end_time;
		this.state = state;
		this.description = description;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this._creator = creator;
		this.logo = logo;
		this.organizer_description = organizer_description;

	}

}