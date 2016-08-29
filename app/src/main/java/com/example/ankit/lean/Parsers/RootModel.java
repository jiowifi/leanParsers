import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public String name;
	public String privacy;
	public String topic;
	public String description;
	public String code_of_conduct;
	public String email;
	public String location_name;
	public CopyrightModel _copyright;
	public String state;
	public int id;
	public String organizer_description;
	public String background_image;
	public String type;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String timezone;
	public String organizer_name;
	public CreatorModel _creator;
	public VersionModel _version;
	public String end_time;

	public RootModel(Call_for_papersModel call_for_papers, String schedule_published_on, String name, String privacy, String topic, String description, String code_of_conduct, String email, String location_name, CopyrightModel copyright, String state, int id, String organizer_description, String background_image, String type, String start_time, ArrayList<Social_linksModel> social_links, String logo, String timezone, String organizer_name, CreatorModel creator, VersionModel version, String end_time) {

		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.privacy = privacy;
		this.topic = topic;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.location_name = location_name;
		this._copyright = copyright;
		this.state = state;
		this.id = id;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.type = type;
		this.start_time = start_time;
		this.social_links = social_links;
		this.logo = logo;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this._version = version;
		this.end_time = end_time;

	}

}