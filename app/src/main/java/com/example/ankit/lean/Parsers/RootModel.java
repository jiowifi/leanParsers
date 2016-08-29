import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String topic;
	public String email;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String privacy;
	public int id;
	public CreatorModel _creator;
	public String start_time;
	public String timezone;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String location_name;
	public String code_of_conduct;
	public String end_time;
	public String state;
	public VersionModel _version;
	public String type;
	public String schedule_published_on;
	public String background_image;
	public String logo;

	public RootModel(CopyrightModel copyright, String topic, String email, String description, Call_for_papersModel call_for_papers, String organizer_description, String privacy, int id, CreatorModel creator, String start_time, String timezone, String organizer_name, ArrayList<Social_linksModel> social_links, String name, String location_name, String code_of_conduct, String end_time, String state, VersionModel version, String type, String schedule_published_on, String background_image, String logo) {

		this._copyright = copyright;
		this.topic = topic;
		this.email = email;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.id = id;
		this._creator = creator;
		this.start_time = start_time;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.name = name;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.state = state;
		this._version = version;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.logo = logo;

	}

}