import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String timezone;
	public String schedule_published_on;
	public String background_image;
	public String start_time;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String end_time;
	public String description;
	public String logo;
	public String organizer_name;
	public String privacy;
	public String name;
	public String email;
	public CreatorModel _creator;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String topic;
	public String type;

	public RootModel(VersionModel version, String timezone, String schedule_published_on, String background_image, String start_time, String location_name, ArrayList<Social_linksModel> social_links, String organizer_description, CopyrightModel copyright, String code_of_conduct, String end_time, String description, String logo, String organizer_name, String privacy, String name, String email, CreatorModel creator, String state, Call_for_papersModel call_for_papers, int id, String topic, String type) {

		this._version = version;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.start_time = start_time;
		this.location_name = location_name;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.description = description;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.name = name;
		this.email = email;
		this._creator = creator;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.topic = topic;
		this.type = type;

	}

}